package VK;

	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;
	
	
	
	public class VirtualsKeys {
	

		    public static void main(String[] args) throws IOException {

		        Path path = Paths.get("C:\\test\\");
		        List<Path> paths = listFiles(path);
		        paths.forEach(x -> System.out.println(x));

		    }

		    // list all files from this path
		    public static List<Path> listFiles(Path path) throws IOException {

		        List<Path> result;
		        try (Stream<Path> walk = Files.walk(path)) {
		        	
		            result = walk.filter(Files::isRegularFile)
		                    .collect(Collectors.toList());
		            
		        }
		        return result;

		    }
}
	
