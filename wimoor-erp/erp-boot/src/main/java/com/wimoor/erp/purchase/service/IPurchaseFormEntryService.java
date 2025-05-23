package com.wimoor.erp.purchase.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.common.user.UserInfo;
import com.wimoor.erp.purchase.pojo.dto.PurchaseTimeDTO;
import com.wimoor.erp.purchase.pojo.entity.PurchaseFormEntry;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public interface IPurchaseFormEntryService extends IService<PurchaseFormEntry>{

	Map<String, Object> summaryBySupplier(String shopid,String supplier);

	void downloadPurchaseInfoWord(HttpServletResponse response, Map<String, Object> map, UserInfo userinfo);

	PurchaseFormEntry getByNumberSku(String companyid, String number, String sku);
	IPage<Map<String, Object>> getPurchaseTimeList(PurchaseTimeDTO dto);

	void downloadTimeList(SXSSFWorkbook workbook, PurchaseTimeDTO dto);
}
