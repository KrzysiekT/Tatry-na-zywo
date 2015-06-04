package com.tarnawski.pogoda;

import java.io.IOException;
import java.io.InputStream;

// Great solution for corrupted JPG images (happens very often at TOPR server)
class JPGClosedInputStream extends InputStream {

    private static final int JPEG_EOI_1 = 0xFF;
    private static final int JPEG_EOI_2 = 0xD9;

    private final InputStream inputStream;
    private int bytesPastEnd;

    public JPGClosedInputStream(final InputStream iInputStream) {
        inputStream = iInputStream;
        bytesPastEnd = 0;
    }

    @Override
    public int read() throws IOException {
        int buffer = inputStream.read();
        if (buffer == -1) {
            if (bytesPastEnd > 0) {
                buffer = JPEG_EOI_2;
            } else {
                ++bytesPastEnd;
                buffer = JPEG_EOI_1;
            }
        }

        return buffer;
    }
}
