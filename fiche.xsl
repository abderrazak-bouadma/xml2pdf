<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method='xml' version='1.0' encoding='UTF-8' indent='yes'/>
    <xsl:template match="/">
        <html>
            <head>
                <title><xsl:value-of select="fiche-circu/document"></xsl:value-of></title>
                <style>
                    table {
                        border: black solid 1px;
                    }

                    table td span {
                        color: limegreen;
                        font-weight: bold;
                    }
                </style>
            </head>
            <body>
                <table border="1px solid black;">
                    <tr>
                        <td><span>Document</span></td>
                        <td><xsl:value-of select="fiche-circu/document"></xsl:value-of></td>
                    </tr>
                </table>
                <p>TEST </p>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>