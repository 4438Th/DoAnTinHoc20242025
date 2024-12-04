package Controllers;

import Models.Product;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListProduct {

    //Field
    private String listName;
    private Product list[];
    private int numOfList;//so luong hang hoa toi da
    private int current;//so luong hang hoa hien tai
    DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");//dinh dang ngay thang theo dd-MM-yyyy
    private final int defaultSize = 100;

    //Constructor
    public ArrayListProduct() {
        this.listName = "Default list";
        this.numOfList = defaultSize;
        this.list = new Product[numOfList];
        this.current = 0;
    }

    public ArrayListProduct(int n, String name) {
        this.listName = name;
        this.numOfList = n;//danh sach chua duoc n hang hoa
        this.list = new Product[numOfList];
        this.current = 0;
    }

    public ArrayListProduct(ArrayListProduct originalList) {
        this.listName = "Clone of " + originalList.getListName();
        this.numOfList = originalList.getNumOfList();
        this.current = originalList.getCurrent();
        if (originalList.getList() != null) {
            this.list = Arrays.stream(originalList.getList())
                    .filter(hh -> hh != null)
                    .map(Product::new)
                    .toArray(Product[]::new);
        } else {
            this.list = null;
        }
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

    public Product[] getList() {
        return list;
    }

    public void setList(Product[] list) {
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
            System.out.println(this.getList()[i].getId() + "\t");
            System.out.println(this.getList()[i].getName() + "\t");
            System.out.println(this.getList()[i].getDate() + "\t");
            System.out.println(this.getList()[i].getQuantity() + "\t");
            System.out.println(this.getList()[i].getPrice() + "\t");
            System.out.println("");
        }
    }

    //kiem tra ma hang hoa da ton tai chua
    public boolean checkId(Product product) {
        //duyet tung hang hoa hien co trong danh sach
        for (int i = 0; i < this.current; i++) {
            //neu maHH da ton tai thi return false
            if (product.getId().equals(this.list[i].getId())) {
                return false;
            }
        }
        return true;//ma hang hoa chua ton tai
    }

    //them hang hoa
    public boolean add(Product product) {
        this.list[this.current++] = product;//them hang hoa vao cuoi danh sach va tang current
        return true;
    }

    //cap nhat thong tin hang hoa
    public boolean update(Product newProduct, int i) {
        this.list[i] = newProduct;//ghi de thong tin hang hoa moi vao vi tri hien tai
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
        Product[] newList = new Product[this.getNumOfList()];
        this.setList(newList);
        this.setCurrent(0);
        return true;
    }

    //tim hang hoa
    public ArrayListProduct search(String id, String name) {
        ArrayListProduct search_result = new ArrayListProduct(this.getCurrent(), "Search of " + this.getListName());//danh sach chua ket qua tim kiem

        boolean conditionByID = !id.equals("");//dieu kien tim kiem theo ID
        boolean conditionByName = !name.equals("");//dieu kien tim kiem theo Name
        int mode = -1;

        if (conditionByID && conditionByName) {
            mode = 0;
        } else if (conditionByID) {
            mode = 1;
        } else if (conditionByName) {
            mode = 2;
        }

        for (int i = 0; i < this.current; i++) {
            boolean checkID = this.list[i].getId().equalsIgnoreCase(id);//kiem tra id
            boolean checkName = this.list[i].getName().equalsIgnoreCase(name);//kiem tra name
            boolean validResult = false;

            switch (mode) {
            case 0 -> {
                if (checkID && checkName) validResult = true;
                }
            case 1 -> {
                if (checkID) validResult = true;
                }
            case 2 -> {
                if (checkName) validResult = true;
                }
        }

            if (validResult) {
                search_result.add(this.list[i]);//neu thoa man dieu kien tim kiem thi them vao search_result
            }
        }
        return search_result;
    }

    //sap xep danh sach theo id
    public ArrayListProduct sort_id(int mode) {
        ArrayListProduct sort_result = new ArrayListProduct(this);//danh sach chua ket qua tim kiem
        if (mode == 0) {//mode 0 sap xep tang dan
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getId));
        } else {//giam dan
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getId).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo name
    public ArrayListProduct sort_name(int mode) {
        ArrayListProduct sort_result = new ArrayListProduct(this);//danh sach chua ket qua tim kiem
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getName));
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getName).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo quantity
    public ArrayListProduct sort_quantity(int mode) {
        ArrayListProduct sort_result = new ArrayListProduct(this);//danh sach chua ket qua tim kiem
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getQuantity));
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getQuantity).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo price
    public ArrayListProduct sort_price(int mode) {
        ArrayListProduct sort_result = new ArrayListProduct(this);//danh sach chua ket qua tim kiem
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getPrice));
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getPrice).reversed());
        }
        return sort_result;
    }

    //sap xep danh sach theo date
    public ArrayListProduct sort_date(int mode) {
        ArrayListProduct sort_result = new ArrayListProduct(this);//danh sach chua ket qua tim kiem
        if (mode == 0) {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getDate).reversed());
        } else {
            Arrays.sort(sort_result.list, Comparator.comparing(Product::getDate));
        }
        return sort_result;
    }

    //chuyen danh sach thanh dang ma tran de hien thi du lieu vao table
    public Object[][] toTableData() {
        Object[][] data = new Object[this.current][6];
        for (int i = 0; i < this.current; i++) {
            Product hh = this.list[i];
            data[i][0] = i + 1;
            data[i][1] = hh.getId();
            data[i][2] = hh.getName();
            data[i][3] = hh.getDate().format(date_formatter);
            data[i][4] = hh.getQuantity();
            data[i][5] = hh.getPrice();
        }
        return data;
    }
}
