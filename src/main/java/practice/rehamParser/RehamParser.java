package practice.rehamParser;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RehamParser {
    public static void main(String[] args) {
        String filePath = "D:/Open Source/spring-practice/oop-practice/src/main/resources/Reham-Khan-Reham-Khan.pdf";
        try {
            PdfReader pdfReader = new PdfReader(filePath);
            PdfTextExtractor.getTextFromPage(pdfReader,1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
