package com.opencell.script;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.meveo.admin.exception.BusinessException;
import org.meveo.commons.utils.StringUtils;
import org.meveo.model.billing.InstanceStatusEnum;
import org.meveo.model.billing.ServiceInstance;
import org.meveo.model.billing.Subscription;
import org.meveo.model.billing.UserAccount;
import org.meveo.model.billing.WalletInstance;
import org.meveo.model.catalog.OfferServiceTemplate;
import org.meveo.model.catalog.OfferTemplate;
import org.meveo.model.catalog.ServiceTemplate;
import org.meveo.model.crm.Provider;
import org.meveo.model.payments.CustomerAccount;
import org.meveo.model.payments.PaymentMethod;
import org.meveo.model.payments.PaymentMethodEnum;
import org.meveo.service.billing.impl.ServiceInstanceService;
import org.meveo.service.billing.impl.SubscriptionService;
import org.meveo.service.catalog.impl.OfferTemplateService;
import org.meveo.service.medina.impl.AccessService;
import org.meveo.service.script.Script;

/**
 * 
 * Add additional cost
 * 
 */
public class SampleScript extends Script {

    private static final long serialVersionUID = 1670038417587535355L;

    private static final String OFFER_CODE = "OF_ADDITIONAL_COST";

    private SubscriptionService subscriptionService = (SubscriptionService) getServiceInterface(SubscriptionService.class.getSimpleName());
    private OfferTemplateService offerTemplateService = (OfferTemplateService) getServiceInterface(OfferTemplateService.class.getSimpleName());
    private ServiceInstanceService serviceInstanceService = (ServiceInstanceService) getServiceInterface(ServiceInstanceService.class.getSimpleName());

    @Override
    public void execute(Map<String, Object> context) {
        log.info("Hello Script!");
    }
}