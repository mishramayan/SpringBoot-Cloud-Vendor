package com.example.e_commerce.app.ecommerce.app.service;

import com.example.e_commerce.app.ecommerce.app.model.CloudVendor;
import org.springframework.stereotype.Service;

@Service
public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
}
