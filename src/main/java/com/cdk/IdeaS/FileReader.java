package com.cdk.IdeaS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileReader {
	private final String currentDirectory;
	private String inputfileName;
	private List<InputModel> inputModelList;

	public FileReader(String currentDirectory, String inputFileName) throws IOException {

		this.currentDirectory = currentDirectory;
		this.inputfileName = inputFileName;
		inputModelList = readFile();
	}

	public List<InputModel> getInputModelList(){
		return Collections.unmodifiableList(inputModelList);
	}
	private List<InputModel> readFile() throws IOException {

		Path path = Paths.get(currentDirectory, inputfileName);
		inputModelList =new ArrayList<>();
		List<String> stringList = Files.readAllLines(path);
		for (String str : stringList) {
			inputModelList.add(parseString(str));
		}
		return inputModelList;

	}

	private InputModel parseString(String strInput) {
		InputModel inputModel = new InputModel();
		String[] strArray = strInput.split(",");
		inputModel.setServerType(strArray[0]);
		inputModel.setSoftwareType(strArray[1]);
		inputModel.setSoftwareName(strArray[2]);
		inputModel.setVersionNo(strArray[3].trim());
		return inputModel;

	}

}
