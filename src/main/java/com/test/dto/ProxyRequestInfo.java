package com.test.dto;

import java.io.Serializable;


public class ProxyRequestInfo implements Serializable {

	private static final long serialVersionUID = 2653126697879586926L;
	public String method;
	public String uri;
	public String customerId;
	public String actionId;
	public byte[] body;
	public String contentType;
	public String productId;
	public String topologyId;
	public String serviceId;

	public ProxyRequestInfo() {
	}

	public ProxyRequestInfo(String method, String uri) {
		this.method = method;
		this.uri = uri;
	}
	
	public ProxyRequestInfo(String method, String uri, String contentType, byte[] body) {
		this.method = method;
		this.uri = uri;
		this.contentType = contentType;
		this.body = body;
	}


	public ProxyRequestInfo setMethod(String method) {
		this.method = method;
		return this;
	}

	public ProxyRequestInfo setUri(String uri) {
		this.uri = uri;
		return this;
	}

	public ProxyRequestInfo setCustomerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	public ProxyRequestInfo setActionId(String actionId) {
		this.actionId = actionId;
		return this;
	}

	public ProxyRequestInfo setBody(byte[] body) {
		this.body = body;
		return this;
	}

	public ProxyRequestInfo setContentType(String contentType) {
		this.contentType = contentType;
		return this;
	}

	public ProxyRequestInfo setProductId(String productId) {
		this.productId = productId;
		return this;
	}

	public ProxyRequestInfo setTopologyId(String topologyId) {
		this.topologyId = topologyId;
		return this;
	}

	public ProxyRequestInfo setServiceId(String serviceId) {
		this.serviceId = serviceId;
		return this;
	}

	@Override
	public String toString() {
		return "ProxyRequestInfo [method=" + method + ", uri=" + uri + ", customerId=" + customerId + ", actionId="
				+ actionId + ", body=" + body + ", productId=" + productId + ", topologyId=" + topologyId
				+ ", serviceId=" + serviceId + "]";
	}
}
