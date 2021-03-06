package ar.edu.unlp.info.oo2.FileManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class FileManagerTest {
	
	private FileManager aFileManager;
	private File aBasicFile;
	private File sizeNameExtDate;
	private File dateSizeName;
	private File nameExtSize;

	@BeforeEach
	void setUp() throws Exception {
		
		aFileManager = new FileManager();
		aBasicFile = new FileOO2();
		sizeNameExtDate = new SizeDecorator(new NameDecorator(new ExtensionDecorator(new CrDateDecorator(new FileOO2()), ".exe"), "File1"), 20.4);
		dateSizeName = new CrDateDecorator(new SizeDecorator(new NameDecorator(new FileOO2(), "File2"), 105.5));
		nameExtSize = new NameDecorator(new ExtensionDecorator(new SizeDecorator(new FileOO2(), 500.9), ".bat"), "File3");
		
	}

	@Test
	void testAddFile() {
		fail("Not yet implemented");
	}

}
