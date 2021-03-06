package seonjae.program.console.stream;

import seonjae.program.console.gui.MainFrame;

import java.io.PrintStream;

public class ConsolePrintStream extends PrintStream {
    public ConsolePrintStream(MainFrame frame) {
        super(new ConsoleOutputStream() {
            public void write(String text) {
                frame.log(text);
            }
        });
    }
}
