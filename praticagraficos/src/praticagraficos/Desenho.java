package praticagraficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Desenho {
	private BufferedImage spritesheet;
	
	//pegando o caminho do dir.
	public Desenho(String path) {
		try {
			spritesheet = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
