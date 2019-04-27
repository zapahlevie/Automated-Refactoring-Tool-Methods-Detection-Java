package com.finalproject.automated.refactoring.tool.methods.detection.java.model;

import com.finalproject.automated.refactoring.tool.model.StatementModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Stack;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

@Data
@Builder
public class SaveStatementVA {

    private String body;

    @Builder.Default
    private Stack<List<StatementModel>> statements = new Stack<>();

    private Integer startStatementIndex;

    private Integer endStatementIndex;
}
