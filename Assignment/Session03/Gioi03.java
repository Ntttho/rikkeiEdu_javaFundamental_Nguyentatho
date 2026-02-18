package Assignment.Session03;

public class Gioi03 {
    /*
     * Khởi tạo 2 mảng có cùng kích thước (ví dụ 5 phần tử)
     * Viết phương thức maxQuantityOfBooks(String[] names, int[] quantities): In ra
     * tên và số lượng của cuốn sách có số lượng lớn nhất
     * Viết phương thức minQuantityOfBooks(String[] names, int[] quantities): In ra
     * tên và số lượng của cuốn sách có số lượng nhỏ nhất
     * Đảm bảo chương trình hoạt động đúng kể cả khi có nhiều sách có cùng số lượng
     * lớn nhất/nhỏ nhất (in tất cả chúng ra)
     */
    static String maxQuantityOfBooks(String[] nammes, int[] quantities){
        int index = 0;
        int max = quantities[index];
        for(int i = 0; i < nammes.length; i++){
            if(quantities[i] < max){
                index = i;
                max = quantities[i];
            }
        }
        return nammes[index];
    }

    static String minQuantityOfBooks(String[] nammes, int[] quantities) {
        int index = 0;
        int min = quantities[index];
        for (int i = 0; i < nammes.length; i++) {
            if (quantities[i] > min) {
                index = i;
                min = quantities[i];
            }
        }
        return nammes[index];
    }

    public static void main(String[] args) {
        String[] books = {"sach 1", "sach 2","sach 3", "sach 4", "sach 5"};
        int[] quantities = {1,2,3,4,3};
        
        System.out.println(maxQuantityOfBooks(books, quantities));
        System.out.println(minQuantityOfBooks(books, quantities));

    }
}
