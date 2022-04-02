package lessons.stepik.modul3.ex5.task2;

public class AsciiCharSequence implements CharSequence{
    private byte[] chByte;

    public AsciiCharSequence(byte[] chByte) {
        this.chByte = chByte;
    }
    @Override
    public int length() {
        return chByte.length;
    }

    @Override
    public char charAt(int index) {

        return (char) chByte[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] charSequence = new byte[end - start];
        for (int i = start; i < end; i++) {
            charSequence[i-start] = chByte[i];
        }
        return new AsciiCharSequence(charSequence);
    }

    @Override
    public String toString() {
        return new String(chByte);
    }
}
