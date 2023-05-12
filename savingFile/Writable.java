package savingFile;

import java.io.Serializable;

public interface Writable {
    public boolean save(Serializable serializable, String filePath);

    public Object read(String filePath);
}
