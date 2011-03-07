package tw.com.citi.utility.web.resources;

import java.io.InputStream;
import java.util.Map;

import tw.com.iisi.aquarius.web.AbstractPdfReportResource;

public class PdfReportResource extends AbstractPdfReportResource {

    @Override
    protected InputStream getReport() {
        String reportName = getParameters().getString("reportName");
        return getClass().getResourceAsStream("/WEB-INF/report/" + reportName);
    }

    @Override
    protected Map<String, Object> getReportParameters() {
        return getParameters();
    }

    @Override
    protected Object getReportData() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Map<String, Object> getExporterParameters() {
        // TODO Auto-generated method stub
        return null;
    }

}
