package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.BrandDTO;
import com.dto.NoteDTO;
import com.dto.PdetailsDTO;
import com.dto.ProductDTO;
import com.dto.ProductResultDTO;
import com.service.ProductService;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService service = new ProductService();
		
		List<ProductDTO> ProductList = service.ProductLsit();
		List<PdetailsDTO> PdetailsList = service.PdetailsList();
		ArrayList<ProductResultDTO> list = new ArrayList<ProductResultDTO>();
		ProductResultDTO rsDTO = null;	
		for(int i =0; i<ProductList.size(); i++) {
			rsDTO = new ProductResultDTO();
			ProductDTO pDTO = ProductList.get(i);
			BrandDTO bDTO = service.BrandList(pDTO.getbNum());
			NoteDTO nDTO = service.NoteList(pDTO.getpNum());
			rsDTO.setBname_eng(bDTO.getBrand_eng());
			rsDTO.setBname_kr(bDTO.getBrand_kr());
			rsDTO.setPname(pDTO.getpName());
			rsDTO.setBaseNote(nDTO.getBasenote());
			rsDTO.setMiddleNote(nDTO.getMiddlenote());
			rsDTO.setTopNote(nDTO.getTopnote());
			rsDTO.setSingleNote(nDTO.getSingle());			
			rsDTO.setPnum(pDTO.getpNum());
			System.out.println("RS====="+rsDTO);
			list.add(i, rsDTO);
		}	
		request.setAttribute("list", list);
		request.setAttribute("Pdetails", PdetailsList);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
