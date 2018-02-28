package com.tistory.pentode;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tistory.pentode.service.BoardService;
import com.tistory.pentode.vo.BoardVO;
import com.tistory.pentode.vo.ChagyebuVO;
import com.tistory.pentode.vo.LittleReView;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class JsonParsingController {

	@Resource(name = "boardService")
	private BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(PagingController.class);
	
	@RequestMapping(value= "/jsonparse.do")
	public String boardOneView() {
		

	    return "jsonparse";
	}
	
	
	@RequestMapping(value = "/searchPost.do", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> searchPost(@RequestBody ChagyebuVO vo) throws Exception {
		logger.info(vo.toString());
	
		return boardService.selectChagyebuList(vo);
	}
	
	/**
	 * GET 방식으로 값을 전달하는 방법 입니다.
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/searchGet.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> searchGet(ChagyebuVO vo) throws Exception {
		logger.info(vo.toString());
	
		return boardService.selectChagyebuList(vo);
	}
	
}
