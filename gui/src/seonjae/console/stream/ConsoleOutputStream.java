package seonjae.console.stream;

import java.io.OutputStream;

public abstract class ConsoleOutputStream extends OutputStream {
    public void write(byte[] b, int off, int len) {
        onWrite(new String(b, off, len));
    }
    public void write(int b) {
        write(new byte[] {(byte) b}, 0, 1);
    }

    public abstract void onWrite(String text);
}
