package net.artron.cms.pic.command;
 
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import net.mars.common.Mars;
import net.artron.command.operate.UpdateCommand;
import net.mars.core.command.OperateCommand;
import net.mars.exception.MarsException;
import net.mars.core.log.MarsLog;

import net.artron.cms.pic.model.Pic;
import net.artron.cms.pic.service.PicService;

/**
 * 修改操作实现类.
 *
 * @author 
 */
@Slf4j 
@SuppressWarnings("serial")
@Service(value = "Pic.update")
public class PicUpdateCommand extends UpdateCommand<Pic, String> {
    /**
	 * 注入Service类对象.
	 */
	@Resource(name = "picService")
	PicService picService;
 
    /**
	 * 操作名称.
	 */
	@Override
	public OperateCommand getOperateCommand() {
		return super.getOperateCommand();
	}
	
	/**
	 * 执行修改操作并记录日志.
	 */
	@MarsLog
	@Override
	public Pic doExecuteService(Pic entity) throws MarsException {
		if (log.isDebugEnabled()) {
			log.debug("{} Pic.update ", Mars.LOG_PRE);
		}
		
		return super.doExecuteService(entity);
	}
}
