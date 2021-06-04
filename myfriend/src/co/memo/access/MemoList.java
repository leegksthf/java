package co.memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.memo.model.Memo;

public class MemoList implements MemoAccess {
	ArrayList<Memo> memos;

	String path = "d:/temp/memo.txt";

	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if (!scanner.hasNext())
					break;
				String str = scanner.next();
				String[] arr = str.split(",");
				memos.add(new Memo(arr[0], arr[1]));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MemoList() {
		memos = new ArrayList<Memo>();
		open();
	}

	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Memo f : memos) {
				fw.write(String.format("%s,%s\n", f.getDate(), f.getContent()));
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(Memo memo) {
		memos.add(memo);
		save();
	}

	@Override
	public void update(Memo memo) {
		for (Memo f : memos) {
			if (f.getDate().equals(memo.getDate())) { // contains
				f.setContent(memo.getContent());
				save();
			}
		}
	}

	@Override
	public void delete(String content) {
		for (Memo f : memos) {
			if (f.getContent().equals(content)) { // contains
				memos.remove(f);
				save();
				break;
			}
		}
	}

	@Override
	public ArrayList<Memo> selectAll() {
		return memos;
	}

	@Override
	public Memo serdate(String date) {
		for (Memo f : memos) {
			if (f.getDate().contains(date)) { // contains
				return f;
			}
		}
		return null;
	}

	@Override
	public Memo sercontent(String content) {
		for (Memo f : memos) {
			if (f.getContent().contains(content)) { // contains
				return f;
			}
		}
		return null;
	}
}
