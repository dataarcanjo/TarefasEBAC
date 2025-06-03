/**
 * @author Rafael Arcanjo
 */
package principal;

public class Player {
	
	private String name;
	private Byte level;
	private String classe;
	
	
	
//  MÉTODOS DO NOME	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	/**MÉTODOS DO NÍVEL
	 * 
	 * @return Retorna o nível do personagem (Não está sendo usado).
	 * 
	 * @deprecated 
	 */
	public Byte getLevel() {
		return level;
	}
	
	public void setLevel (Byte level) {
		this.level = level;
	}
	
	/**MÉTODOS DA CLASSE
	 * 
	 * @return Retorna a classe do personagem.
	 */
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	} 
}
