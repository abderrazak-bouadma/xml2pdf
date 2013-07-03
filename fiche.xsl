<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method='html' version='1.0' encoding='UTF-8' indent='yes'/>
    <xsl:template match="/">
        <html>

            <body>
                <table border="1">
                    <tr>
                        <td>Document</td>
                        <td><xsl:value-of select="fiche-circu/document"></xsl:value-of></td>
                    </tr>
                </table>
                <p>TEST </p>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>