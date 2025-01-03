package com.example.e_commerce.app.ecommerce.app.controller;

import com.example.e_commerce.app.ecommerce.app.model.CloudVendor;
import com.example.e_commerce.app.ecommerce.app.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.deleteCloudVendor(vendorId);
    }

}
