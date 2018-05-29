package com.bootstrap.banksy;

import com.bootstrap.banksy.core.base.Constants;
import com.bootstrap.banksy.core.domain.SysModule;
import com.bootstrap.banksy.core.domain.SysOrg;
import com.bootstrap.banksy.core.service.ModuleService;
import com.bootstrap.banksy.core.service.OrgService;
import com.bootstrap.banksy.utils.SnowflakeIdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BanksyApplicationTests {

    @Autowired
    private SnowflakeIdWorker idWorker;
    @Autowired
    private OrgService orgService;
    @Autowired
    private ModuleService moduleService;

    @Test
    public void testSaveOrgs() {
        int serNo = 1;
        SysOrg parentOrg = new SysOrg();
        parentOrg.setId(idWorker.uuid());
        parentOrg.setParentId("-1");
        parentOrg.setNodeType(Constants.NodeType.ORG);
        parentOrg.setSerNo(serNo);
        parentOrg.setCode("10000000");
        parentOrg.setName("系统机构");
        parentOrg.setAlias("alias");
        parentOrg.setFullname("系统机构");
        parentOrg.setValidity(Constants.Validity.YES);
        parentOrg.setIsDel(Constants.Validity.YES);
        parentOrg.setCreatorUserid("SYSTEM");
        parentOrg.setCreateTime(new Date());

        for (int i = 0; i < 10; i++) {
            serNo++;
            SysOrg subOrg = new SysOrg();
            subOrg.setId(idWorker.uuid());
            subOrg.setParentId(parentOrg.getId());
            subOrg.setNodeType(Constants.NodeType.ORG);
            subOrg.setSerNo(serNo);
            subOrg.setCode(parentOrg.getCode() + "000" + i);
            subOrg.setName("二级机构" + i);
            subOrg.setAlias("alias");
            subOrg.setFullname("二级机构" + i);
            subOrg.setValidity(Constants.Validity.YES);
            subOrg.setIsDel(Constants.Validity.YES);
            subOrg.setCreatorUserid("SYSTEM");
            subOrg.setCreateTime(new Date());
            for (int j = 0; j < 15; j++) {
                serNo++;
                SysOrg thirdOrg = new SysOrg();
                thirdOrg.setId(idWorker.uuid());
                thirdOrg.setParentId(subOrg.getId());
                thirdOrg.setNodeType(Constants.NodeType.DEPARTMENT);
                thirdOrg.setSerNo(serNo);
                if (i > 10) {
                    thirdOrg.setCode(subOrg.getCode() + "00" + j);
                } else {
                    thirdOrg.setCode(subOrg.getCode() + "000" + j);
                }
                thirdOrg.setName("三级机构" + i + j);
                thirdOrg.setAlias("alias");
                thirdOrg.setFullname("三级机构" + i + j);
                thirdOrg.setValidity(Constants.Validity.YES);
                thirdOrg.setIsDel(Constants.Validity.YES);
                thirdOrg.setCreatorUserid("SYSTEM");
                thirdOrg.setCreateTime(new Date());

                orgService.save(thirdOrg);
            }
            orgService.save(subOrg);
        }
        orgService.save(parentOrg);
    }


    @Test
    public void testSaveMenu(){
        String[] buttons = new String[]{"添加","修改","删除"};
        String[] subMenus = new String[]{"机构管理","菜单管理","人员管理","角色管理","字典设置"};
        String[] subMenusName = new String[]{"/settings/orgList","/settings/menuList","/settings/userList","/settings/roleList","/settings/dictList"};
        SysModule sysModule = new SysModule();
        sysModule.setId(idWorker.uuid());
        sysModule.setParentId("-1");
        sysModule.setLevel(Constants.MenuType.LEVEL_WINDOW);
        sysModule.setName("APP ONE");
        sysModule.setRegisterTime(new Date());
        sysModule.setCreateTime(new Date());
        sysModule.setCreatorUserid("SYSTEM");
        sysModule.setIsDel(Constants.Validity.YES);

        SysModule sub = new SysModule();
        sub.setId(idWorker.uuid());
        sub.setParentId(sysModule.getId());
        sub.setLevel(Constants.MenuType.LEVEL_MENU);
        sub.setName("系统设置");
        sub.setRegisterTime(new Date());
        sub.setCreateTime(new Date());
        sub.setCreatorUserid("SYSTEM");
        sub.setIsDel(Constants.Validity.YES);

        for (int i = 0 ; i < subMenus.length ; i++) {
            SysModule item = new SysModule();
            item.setId(idWorker.uuid());
            item.setParentId(sub.getId());
            item.setLevel(Constants.MenuType.LEVEL_SUB_MENU);
            item.setName(subMenus[i]);
            item.setRegisterTime(new Date());
            item.setCreateTime(new Date());
            item.setCreatorUserid("SYSTEM");
            item.setLocation(subMenusName[i]);
            item.setIsDel(Constants.Validity.YES);

            for (int j = 0; j < buttons.length; j++) {
                SysModule button = new SysModule();
                button.setId(idWorker.uuid());
                button.setParentId(item.getId());
                button.setLevel(Constants.MenuType.LEVEL_BUTTON);
                button.setName(buttons[j]);
                button.setRegisterTime(new Date());
                button.setCreateTime(new Date());
                button.setCreatorUserid("SYSTEM");
                button.setLocation("");
                button.setIsDel(Constants.Validity.YES);

                moduleService.save(button);
            }
            moduleService.save(item);
        }

        moduleService.save(sub);
        moduleService.save(sysModule);
    }
}
