package com.ahxinin.chain;

/**
 * @author : Kane
 * @description: TODO
 * @date : 2023-01-29
 */
public abstract class AbstractChainSupport implements Chain{

    private Chain next;

    @Override
    public ValidResult executeNextChain(ExecuteChain executeChain) {
        return next!=null ? this.next.execute(executeChain) : ValidResult.ok();
    }
}
