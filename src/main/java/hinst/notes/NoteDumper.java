package hinst.notes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NoteDumper implements CommandLineRunner {

	@Autowired 
	NoteRepository noteRepository;
	
	Logger logger = LogManager.getLogger(this.getClass());
			
	@Override
	public void run(String... args) throws Exception {
		logger.debug("hello");
		for (Note note: noteRepository.findAll()) {
			System.out.println(note.toString());
		}
	}
	
}
