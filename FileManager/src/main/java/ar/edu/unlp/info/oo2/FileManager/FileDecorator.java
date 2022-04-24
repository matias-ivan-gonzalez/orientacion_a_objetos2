package ar.edu.unlp.info.oo2.FileManager;

public class FileDecorator extends File {
	
	protected File aDecoratedFile;
	
	public FileDecorator() {
		aDecoratedFile = null;
	}
	
	public FileDecorator(File aFileToDecorate) {
		this.aDecoratedFile = aFileToDecorate;
	}
	
	public String prettyPrint() {
		return this.toString() + 
				this.aDecoratedFile.prettyPrint();
	}

	@Override
	public File decorateWith(FileDecorator aDecorator) {
		return aDecoratedFile = aDecorator;
	}	

}