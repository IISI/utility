package tw.com.citi.utility.web;

import org.apache.wicket.Page;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.util.lang.PackageName;

import tw.com.citi.utility.web.pages.Home;
import tw.com.citi.utility.web.resources.PdfReportResource;
import tw.com.iisi.aquarius.web.AbstractAquariusWebApplication;

public class UtilityWebApplication extends AbstractAquariusWebApplication {

    @Override
    protected void init() {
        super.init();
        mount("/app", PackageName.forClass(Home.class));
        getSharedResources().add("PDF_REPORT", new PdfReportResource());
        ResourceReference pdfRef = new ResourceReference("PDF_REPORT");
        mountSharedResource("/report/pdf", pdfRef.getSharedResourceKey());
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return Home.class;
    }

}
