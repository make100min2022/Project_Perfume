package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BrandDTO;
import com.dto.NoteDTO;
import com.dto.PdetailsDTO;
import com.dto.ProductDTO;

public class ProductDAO {
	public List<ProductDTO> ProductList(SqlSession session) {
		List<ProductDTO> list = session.selectList("ProductMapper.ProductList");
		return list;
	}
		public List<PdetailsDTO> PdetailsList(SqlSession session) {
			List<PdetailsDTO> list = session.selectList("ProductMapper.PdetailsList");
			return list;
		}
		public BrandDTO BrandList(SqlSession session, int bnum) {
			BrandDTO bDTO = session.selectOne("ProductMapper.BrandList", bnum);
			return bDTO;
		}
		public NoteDTO NoteList(SqlSession session, int pnum) {
			NoteDTO nDTO = session.selectOne("ProductMapper.NoteList", pnum);
			return nDTO;
		}

}
