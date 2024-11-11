package DanhSachDac;

import Classes.HangHoa;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class DanhSachHangHoa1 {

    //Field
    private String listName;
    private HangHoa list[];
    private int numOfList;//so luong hang hoa toi da
    private int current;//so luong hang hoa hien tai
    DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");//dinh dang ngay thang theo dd-MM-yyyy
    private final int defaultSize = 100;

    //Constructor
    public DanhSachHangHoa1() {
        this.listName = "Default list";
        this.numOfList = defaultSize;
        this.list = new HangHoa[numOfList];
        this.current = 0;
    }

    public DanhSachHangHoa1(int n, String name) {
        this.listName = name;
        this.numOfList = n;//danh sach chua duoc n hang hoa
        this.list = new HangHoa[numOfList];
        this.current = 0;
    }

    public String getListName() {
        return listName;
    }

    //Property
    public void setListName(String listName) {
        this.listName = listName;
    }

    public int getNumOfList() {
        return numOfList;
    }

    public void setNumOfList(int numOfList) {
        this.numOfList = numOfList;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public HangHoa[] getList() {
        return list;
    }

    public void setList(HangHoa[] list) {
        this.list = list;
    }

    //Methods
    //kiem tra mang day hay chua
    public boolean isFull() {
        return (this.current >= this.list.length);
    }

    //kiem tra mang rong hay khong
    public boolean isEmpty() {
        return (this.current == 0);
    }

    //xuat danh sach trong console
    private int consoleOuput_Times = 0;

    public void consoleOuput() {
        System.out.println("ConsoleOuput_Times: " + consoleOuput_Times++);
        System.out.println("List: " + this.getListName());
        System.out.println("Current: " + this.getCurrent());
        for (int i = 0; i < this.getCurrent(); i++) {
            System.out.println(this.getList()[i].getMaHH() + "\t");
            System.out.println(this.getList()[i].getTenHH() + "\t");
            System.out.println(this.getList()[i].getNgaySanXuat() + "\t");
            System.out.println(this.getList()[i].getSoLuong() + "\t");
            System.out.println(this.getList()[i].getGiaTien() + "\t");
            System.out.println("");
        }
    }

    //kiem tra ma hang hoa da ton tai chua
    public boolean checkMaHH(HangHoa hangHoa) {
        //duyet tung hang hoa hien co trong danh sach
        for (int i = 0; i < this.current; i++) {
            //neu maHH da ton tai thi return false
            if (hangHoa.getMaHH().equals(this.list[i].getMaHH())) {
                return false;
            }
        }
        return true;//ma hang hoa chua ton tai
    }

    //them hang hoa
    public boolean add(HangHoa hangHoa) {
        this.list[this.current++] = hangHoa;//them hang hoa vao cuoi danh sach va tang current
        return true;
    }

    //cap nhat thong tin hang hoa
    public boolean update(HangHoa newHangHoa, int i) {
        this.list[i] = newHangHoa;//ghi de thong tin hang hoa moi vao vi tri hien tai
        return true;
    }

    //xoa hang hoa tai vi tri i trong danh sach
    public boolean remove(int i) {
        if (i == -1) {//kiem tra vi tri truoc khi xoa
            return false;
        }
        for (int j = i; j < this.current; j++) {
            this.list[j] = this.list[j + 1];//ghi de hang hoa phia sau len truoc de xoa
        }
        this.current--;//giam current
        return true;
    }

    //xoa danh sach
    public boolean removeAll() {
        if (this.isEmpty()) {
            return false;
        }
        HangHoa[] newList = new HangHoa[this.getNumOfList()];
        this.setList(newList);
        this.setCurrent(0);
        return true;
    }

    //tim hang hoa
    public DanhSachHangHoa1 search(String maHangHoa, String tenHangHoa) {
        DanhSachHangHoa1 search_result = new DanhSachHangHoa1(this.getCurrent(), "Search of " + this.getListName());//danh sach chua ket qua tim kiem
        //tim theo maHH
        if (!maHangHoa.equals("")) {
            for (int i = 0; i < this.current; i++) {
                if (this.list[i].getMaHH().equals(maHangHoa)) {
                    search_result.add(this.list[i]);//neu tim thay thi them vao search_result
                }
            }
        } else if (!tenHangHoa.equals("")) {//tim theo maHH
            for (int i = 0; i < this.current; i++) {
                if (this.list[i].getTenHH().equals(tenHangHoa)) {
                    search_result.add(this.list[i]);//neu tim thay thi them vao search_result
                }
            }
        } else if (!maHangHoa.equals("") && !tenHangHoa.equals("")) {//tim theo maHH va tenHH
            for (int i = 0; i < this.current; i++) {
                if (this.list[i].getMaHH().equals(maHangHoa)) {
                    if (this.list[i].getTenHH().equals(tenHangHoa)) {
                        search_result.add(this.list[i]);//neu tim thay thi them vao search_result
                    }
                }
            }
        }
        return search_result;
    }

    //sap xep danh sach theo maHH
    public DanhSachHangHoa1 sort_maHH(int mode) {
        DanhSachHangHoa1 sort_result = new DanhSachHangHoa1();//danh sach chua ket qua tim kiem
        sort_result.list = Arrays.stream(this.list).filter(hangHoa -> hangHoa != null).toArray(HangHoa[]::new);//loc cac phan tu null ra khoi danh sach
        sort_result.current = sort_result.list.length;//dong bo do dai de sap xep
        if (mode == 0) {//mode 0 sap xep tang dan
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getMaHH));
        } else {//giam dan
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getMaHH).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo tenHH
    public DanhSachHangHoa1 sort_tenHH(int mode) {
        DanhSachHangHoa1 sort_result = new DanhSachHangHoa1();
        sort_result.list = Arrays.stream(this.list).filter(hangHoa -> hangHoa != null).toArray(HangHoa[]::new);
        sort_result.current = sort_result.list.length;
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getTenHH));
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getTenHH).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo so luong
    public DanhSachHangHoa1 sort_SoLuong(int mode) {
        DanhSachHangHoa1 sort_result = new DanhSachHangHoa1();
        sort_result.list = Arrays.stream(this.list).filter(hangHoa -> hangHoa != null).toArray(HangHoa[]::new);
        sort_result.current = sort_result.list.length;
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getSoLuong));
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getSoLuong).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo gia tien
    public DanhSachHangHoa1 sort_Gia(int mode) {
        DanhSachHangHoa1 sort_result = new DanhSachHangHoa1();
        sort_result.list = Arrays.stream(this.list).filter(hangHoa -> hangHoa != null).toArray(HangHoa[]::new);
        sort_result.current = sort_result.list.length;
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getGiaTien));
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getGiaTien).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo ngay san xuat
    public DanhSachHangHoa1 sort_NgaySanXuat(int mode) {
        DanhSachHangHoa1 sort_result = new DanhSachHangHoa1();
        sort_result.list = Arrays.stream(this.list).filter(hangHoa -> hangHoa != null).toArray(HangHoa[]::new);
        sort_result.current = sort_result.list.length;
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getNgaySanXuat).reversed());
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(HangHoa::getNgaySanXuat));
        }
        return sort_result;
    }

    //chuyen danh sach thanh dang ma tran de hien thi du lieu vao table
    public Object[][] toTableData() {
        Object[][] data = new Object[this.current][6];
        for (int i = 0; i < this.current; i++) {
            HangHoa hh = this.list[i];
            data[i][0] = i + 1;
            data[i][1] = hh.getMaHH();
            data[i][2] = hh.getTenHH();
            data[i][3] = hh.getNgaySanXuat().format(date_formatter);
            data[i][4] = hh.getSoLuong();
            data[i][5] = hh.getGiaTien();
        }
        return data;
    }
}
