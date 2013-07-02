package com.cdc.pcp.utils;

import com.lowagie.text.DocumentException;
import org.junit.Test;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: abderrazak
 * Date: 7/2/13
 * Time: 10:46 PM
 */
public class FlyingSaucerPOCTest {

    @Test
    public void simpleXml2PDFTest() throws IOException, DocumentException {

        //
        String inputFilename = "~/Job/FICHE_FAQ_FR.pdf.xml";
        String outputFilename = "fiche.pdf";

        //
        File file = new File(outputFilename);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        OutputStream outputStream = new FileOutputStream(file);
        ITextRenderer iTextRenderer = new ITextRenderer();
        File xmlFile = new File(inputFilename);
        iTextRenderer.setDocument(xmlFile);
        iTextRenderer.layout();
        iTextRenderer.createPDF(outputStream);
        outputStream.close();
    }
}
