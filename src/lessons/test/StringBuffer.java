package lessons.test;

public class StringBuffer {
    public static void main(String[] args) {
        DataSince data = new DataSince(501234567, 33);
        System.out.println(data.getPhoneNumber());
    }


}
class DataSince{
    private int phoneNumber;
    private int phoneCode;




    public DataSince(int phoneNumber, int phoneCode) {
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
    }

    public String getPhoneNumber() {
        StringBuilder result = new StringBuilder(String.format("%010d",phoneNumber));
        result.insert(0, "(").insert(4, ")").insert(8, "-").insert(11, "-");
        result.insert(0, "+").insert(1 , String.valueOf(phoneCode));
        return result.toString();
    }
}
