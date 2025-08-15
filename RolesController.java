package crm_app10.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crm_app10.services.RolesServices;
import entity.Roles;
@WebServlet(name="rolesController", urlPatterns = {"/roles"})
public class RolesController extends HttpServlet {
	private RolesServices rolesService = new RolesServices();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Roles> listRoles = rolesService.getAllRole();
		System.out.println("danh sach role: "+ listRoles.size());
		req.setAttribute("listRole", listRoles);
		req.getRequestDispatcher("role_table.jsp").forward(req, resp);
	}
}
