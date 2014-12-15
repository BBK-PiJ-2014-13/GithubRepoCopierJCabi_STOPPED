package copierCore;

import org.junit.Test;

import com.jcabi.github.Coordinates;
import com.jcabi.github.Github;
import com.jcabi.github.Repo;
import com.jcabi.github.RtGithub;

public class CopierTest extends BasicTest {
	CopierImpl copier;
	Github github;
	
	@Test
	public void testsGetRepo() {
		copier = new CopierImpl();
		valueActual = copier.getRepo("BBK-PiJ-2014-13/Test");
		
		github = new RtGithub();
		Repo repo = github.repos().get(new Coordinates.Simple("BBK-PiJ-2014-13/Test"));
		valueExpected = repo;
		test();
	}
	
	@Test
	public void testsGetContents() {
		copier = new CopierImpl();
		github = new RtGithub();
		Repo repo = github.repos().get(new Coordinates.Simple("BBK-PiJ-2014-13/Test"));
		valueActual = copier.getContents(repo);

		valueExpected = repo.contents();
		test();
	}
	
	@Test
	public void testsWriteStream() {
		copier = new CopierImpl();
		github = new RtGithub();
		Repo repo = github.repos().get(new Coordinates.Simple("BBK-PiJ-2014-13/Test"));
	}
}
