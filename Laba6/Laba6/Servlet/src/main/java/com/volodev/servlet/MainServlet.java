package com.volodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Объёмы фигур</title>");
        out.println("<style>");
        out.println("body {background-color: aqua; font-family: 'Verdana';}");
        out.println("h1 {font-size: 180%;}");
        out.println("form {font-size: 150%;}");
        out.println("select {font-size: 60%;}");
        out.println("input {font-size: 60%;}");
        out.println("p {font-size: 22px;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Вычисление объёмов фигур</h1>");
        out.println("<form action='app' method='post'>");
        out.println("<p>Выберите фигуру: <select name='figure'>");
        out.println("<option value='parall'>Параллелепипед</option>");
        out.println("<option value='cube'>Куб</option>");
        out.println("<option value='tetra'>Тетраэдр</option>");
        out.println("<option value='ball'>Шар</option>");
        out.println("<option value='cylinder'>Цилиндр</option>");
        out.println("<option value='cone'>Конус</option>");
        out.println("</select></p>");
        out.println("<p>Точность (знаки после запятой): <input type='text' name='precision' size='5' value='1'></p>");
        out.println("<p>Параметры:</p>");
        out.println("<p>Длина: <input type='text' name='length' size='5' value='1'></p>");
        out.println("<p>Ширина: <input type='text' name='width' size='5' value='1'></p>");
        out.println("<p>Высота: <input type='text' name='height' size='5' value='1'></p>");
        out.println("<p>Радиус: <input type='text' name='radius' size='5' value='1'></p>");
        out.println("<hr>");
        out.println("<input type='submit' value='Вычислить'>");
        out.println("</form>");
        out.println("<p>Результат: </p>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String figure = request.getParameter("figure");
        int precision = Integer.parseInt(request.getParameter("precision"));
        double length = Double.parseDouble(request.getParameter("length"));
        double width = Double.parseDouble(request.getParameter("width"));
        double height = Double.parseDouble(request.getParameter("height"));
        double radius = Double.parseDouble(request.getParameter("radius"));
        double result = 0.0;

        switch (figure) {
            case "parall":
                result = CalculatingVolumes.Parallelepiped(length, width, height, precision);
                break;
            case "cube":
                result = CalculatingVolumes.Cube(length, precision);
                break;
            case "tetra":
                result = CalculatingVolumes.Tetrahedron(length, precision);
                break;
            case "ball":
                result = CalculatingVolumes.Ball(radius, precision);
                break;
            case "cylinder":
                result = CalculatingVolumes.Cylinder(height, radius, precision);
                break;
            case "cone":
                result = CalculatingVolumes.Cone(height, radius, precision);
                break;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Объёмы фигур</title>");
        out.println("<style>");
        out.println("body {background-color: aqua; font-family: 'Verdana';}");
        out.println("h1 {font-size: 180%;}");
        out.println("form {font-size: 150%;}");
        out.println("select {font-size: 60%;}");
        out.println("input {font-size: 60%;}");
        out.println("p {font-size: 22px;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Вычисление объёмов фигур</h1>");
        out.println("<form action='app' method='post'>");
        out.println("<p>Выберите фигуру: <select name='figure'>");
        out.println("<option value='parall'>Параллелепипед</option>");
        out.println("<option value='cube'>Куб</option>");
        out.println("<option value='tetra'>Тетраэдр</option>");
        out.println("<option value='ball'>Шар</option>");
        out.println("<option value='cylinder'>Цилиндр</option>");
        out.println("<option value='cone'>Конус</option>");
        out.println("</select></p>");
        out.println("<p>Точность (знаки после запятой): <input type='text' name='precision' size='5' value='" + precision + "'></p>");
        out.println("<p>Параметры:</p>");
        out.println("<p>Длина: <input type='text' name='length' size='5' value='" + length + "'></p>");
        out.println("<p>Ширина: <input type='text' name='width' size='5' value='" + width + "'></p>");
        out.println("<p>Высота: <input type='text' name='height' size='5' value='" + height + "'></p>");
        out.println("<p>Радиус: <input type='text' name='radius' size='5' value='" + radius + "'></p>");
        out.println("<hr>");
        out.println("<input type='submit' value='Вычислить'>");
        out.println("</form>");
        out.println("<p>Результат: " + result + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}