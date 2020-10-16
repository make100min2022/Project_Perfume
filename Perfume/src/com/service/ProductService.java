package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;

import com.config.MySqlSessionFactory;
import com.dao.ProductDAO;
import com.dto.BrandDTO;
import com.dto.NoteDTO;
import com.dto.PdetailsDTO;
import com.dto.ProductDTO;

public class ProductService {
	  
	
	
	public List<ProductDTO> ProductLsit() {
		  SqlSession session = MySqlSessionFactory.getSession();
		  System.out.println(session);
		  List<ProductDTO> list = null;
		  try {
			  ProductDAO dao = new ProductDAO();
			  list = dao.ProductList(session);
		  }finally {
			session.close();
		}
		  return list;
	   }//end memberAdd
	
	public List<PdetailsDTO> PdetailsList() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<PdetailsDTO> list = null;
		try {
			ProductDAO dao = new ProductDAO();
			list = dao.PdetailsList(session);
		}finally {
			session.close();
		}
		return list;
	}//end memberAdd
	public BrandDTO BrandList(int bnum) {
		SqlSession session = MySqlSessionFactory.getSession();
		BrandDTO bDTO = null;
				try {
			ProductDAO dao = new ProductDAO();
			bDTO = dao.BrandList(session, bnum);
		}finally {
			session.close();
		}
		return bDTO;
	}//end memberAdd
	public NoteDTO NoteList(int pnum) {
		SqlSession session = MySqlSessionFactory.getSession();
		NoteDTO nDTO = new NoteDTO();
		try {
			ProductDAO dao = new ProductDAO();
			nDTO = dao.NoteList(session, pnum);
		}finally {
			session.close();
		}
		return nDTO;
	}//end memberAdd
}//end class
