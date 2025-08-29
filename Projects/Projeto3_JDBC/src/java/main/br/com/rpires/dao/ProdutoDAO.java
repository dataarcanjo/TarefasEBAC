package br.com.rpires.dao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.rpires.dao.jdbc.ConnectionFactory;

public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Integer cadastrar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "INSERT INTO TB_PRODUTOS (ID, CODIGO, NOME, CUSTO) VALUES (nextval('SQ_PRODUTOS'), ?, ?, ?);";
			stm = connection.prepareStatement(sql);
			stm.setString(1, produto.getCodigo());
			stm.setString(2, produto.getNome());
			
			BigDecimal bd = new BigDecimal(Double.toString(produto.getCusto()));
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			double rounded = bd.doubleValue();
			stm.setDouble(3, rounded);
			
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Produto consultar(Long id) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Produto produto = new Produto();
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM tb_produtos WHERE id = ?;";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, id);
			
			rs = stm.executeQuery();
			if (rs.next()) {
				produto.setId(rs.getLong("id"));
				produto.setCodigo(rs.getString("codigo"));
				produto.setNome(rs.getString("nome"));
				produto.setCusto(rs.getDouble("custo"));
			}
			return produto;	
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Integer excluir(Long id) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "DELETE FROM tb_produtos WHERE id = ?";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, id);
			
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Integer atualizar(Produto produto, Long id) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "UPDATE tb_produtos SET codigo = ?, nome = ?, custo = ? WHERE id = ?;";
			stm = connection.prepareStatement(sql);
			stm.setString(1, produto.getCodigo());
			stm.setString(2, produto.getNome());
			BigDecimal bd = new BigDecimal(Double.toString(produto.getCusto()));
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			double rounded = bd.doubleValue();
			stm.setDouble(3, rounded);
			stm.setLong(4, id);
			
			return stm.executeUpdate();
			
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public List<Produto> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		List<Produto> produtos = new ArrayList<>();
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM tb_produtos;";
			stm = connection.prepareStatement(sql);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getLong("id"));
				produto.setCodigo(rs.getString("codigo"));
				produto.setNome(rs.getString("nome"));
				produto.setCusto(rs.getDouble("custo"));

				produtos.add(produto);
			}
			return produtos;
			
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

}
