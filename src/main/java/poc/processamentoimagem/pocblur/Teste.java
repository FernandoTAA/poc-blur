package poc.processamentoimagem.pocblur;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.opencv.core.Rect;

public class Teste {

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().load(Teste.class.getResource("/lib/opencv_java340.dll").getPath());
		File file = new File(Teste.class.getResource("/img/image.jpg").getPath());
		BufferedImage bufferedImage = ImageUtils.blurRectangleInImage(file, new Rect(500, 170, 200, 300));

		File outPutfFile = new File("C:\\000000.JPG");
		ImageIO.write(bufferedImage, "jpg", outPutfFile);
	}
}
