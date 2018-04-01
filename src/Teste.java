import static org.junit.Assert.*;
import org.junit.Test;

public class Teste {
	
	@Test // testar a idade
	public void idadeTeste() {
		Irpf temer = new Irpf ("12312312-00", "Michel Miguel Elias Temer Lulia");
		temer.setIdade(77);
		assertEquals(77, temer.getIdade());
		}
}
