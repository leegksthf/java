package co.micol.prj.image.service;

import java.util.List;

import co.micol.prj.image.vo.FileInformationVO;

public interface FileInfoMapper {
	List<FileInformationVO> fileSelectList();
	FileInformationVO fileSelect(int key);
	int fileInsert(FileInformationVO vo);
	int fileDelete(int key);
	int fileUpdate(FileInformationVO vo);
}
