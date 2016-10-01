package com.raizlabs.android.dbflow.processor.validator

import com.raizlabs.android.dbflow.processor.definition.method.DatabaseDefinition
import com.raizlabs.android.dbflow.processor.model.ProcessorManager

/**
 * Description:
 */
class DatabaseValidator : Validator<DatabaseDefinition> {
    override fun validate(processorManager: ProcessorManager,
                          validatorDefinition: DatabaseDefinition): Boolean {
        if (validatorDefinition.outputClassName == null) {
            return false
        }

        return true
    }
}
