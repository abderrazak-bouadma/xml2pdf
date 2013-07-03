package com.cdc.pcp.utils;

import com.lowagie.text.DocumentException;
import org.junit.Test;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
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
    public void simpleXml2PDFTest() throws IOException, DocumentException, TransformerException {

        //
        String inputXMLFilename = "fiche2.xml";
        String outputHTMLFilename = "fiche.html";
        String inputXSLFilename = "fiche.xsl";
        String outputPDFFilename = "fiche.pdf";

        // apply XSLT
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(inputXSLFilename));
        transformer.transform(new StreamSource(inputXMLFilename),new StreamResult(new FileOutputStream(outputHTMLFilename)));

        // transform result to PDF
        OutputStream pdfOutputStream = new FileOutputStream(outputPDFFilename);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(outputHTMLFilename);
        renderer.layout();
        renderer.createPDF(pdfOutputStream);

        // close streams
        pdfOutputStream.close();

    }
}
