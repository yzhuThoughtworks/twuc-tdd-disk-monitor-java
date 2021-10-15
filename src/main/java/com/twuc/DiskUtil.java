package com.twuc;

import java.io.File;

public class DiskUtil {
    public static final int TRANSFER_UNIT = 1024;

    public static final String DISK_PATH = "/";

    public long freeDisk() {
        long freeSpace = new File(DISK_PATH).getFreeSpace();

        return freeSpace / TRANSFER_UNIT / TRANSFER_UNIT / TRANSFER_UNIT;
    }
}
