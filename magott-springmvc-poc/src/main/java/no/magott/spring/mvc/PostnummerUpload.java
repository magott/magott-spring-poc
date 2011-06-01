package no.magott.spring.mvc;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PostnummerUpload {

	private final static Log log = LogFactory.getLog(PostnummerUpload.class);
	
    @RequestMapping(value = "/postnrUpload", method = RequestMethod.POST)
    public String handleFormUpload(@RequestParam("name") String name,
        @RequestParam("file") MultipartFile file) throws IOException {
    	log.debug("File upload is being processed");
        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            // store the bytes somewhere
           return "uploadSuccess";
       } else {
           return "uploadFailure";
       }
    }

    @RequestMapping(value = "/postnrUpload", method = RequestMethod.GET)
    public String displayUploadForm(){
    	return "uploadPostnr";
    }

    
}
