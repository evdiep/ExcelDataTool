import java.io.*;

public class Runner {
    // TODO add log4j
    //  ADD LOG FILELogger LOG = new Logger();
    public static final MyLogger LOG = new MyLogger();
public static String EXCEL_SOURCE_FILE_PATH = "input/excel_source_file.xls";
    public static void main (String[] args) throws IOException {
        LOG.debug("Opening File from FilePath: " + EXCEL_SOURCE_FILE_PATH);
        ExcelHelper excelHelper = new ExcelHelper(EXCEL_SOURCE_FILE_PATH);
        excelHelper.printAllContents();
    }
}
