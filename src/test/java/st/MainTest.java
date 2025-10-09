package st;

import static org.junit.Assert.assertEquals;
import static st.Main.getVersion;

import org.junit.Test;

public class MainTest {

    // Chọn phiên bản để kiểm thử
    private final int VERSION = 2;

    protected Main main = getVersion(VERSION);
}

