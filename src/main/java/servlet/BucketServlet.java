package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import service.BucketService;
import service.impl.BucketServiceImpl;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "bucket", value = "/bucket")

public class BucketServlet extends HttpServlet {
    private BucketService bucketService = BucketServiceImpl.getBucketServiceImpl();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bucketId = req.getParameter("bucketId");
        bucketService.delete(Integer.parseInt(bucketId));

        resp.setContentType("text/plane");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("Success");
    }
}
