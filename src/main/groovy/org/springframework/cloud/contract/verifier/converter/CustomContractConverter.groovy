package org.springframework.cloud.contract.verifier.converter

import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.spec.ContractConverter

class CustomContractConverter implements ContractConverter<List<YamlContract>> {
    @Override
    boolean isAccepted(File file) {
        throw new Exception("The method has been called")
    }

    @Override
    Collection<Contract> convertFrom(File file) {
        throw new Exception("The method has been called")
    }

    @Override
    List<YamlContract> convertTo(Collection<Contract> contract) {
        throw new Exception("The method has been called")
    }
}
