package hinst.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NoteDumper implements CommandLineRunner {

	@Autowired 
	NoteRepository noteRepository;

	@Override
	public void run(String... args) throws Exception {
		for (Note note: noteRepository.findAll()) {
			System.out.println(note.toString());
		}
	}
	
}
