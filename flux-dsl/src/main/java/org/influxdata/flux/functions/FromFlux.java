/*
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.influxdata.flux.functions;

import javax.annotation.Nonnull;

/**
 * <a href="https://github.com/influxdata/platform/tree/master/query#from">from</a> - starting point
 * for all queries. Get data from the specified bucket.
 *
 * <h3>Options</h3>
 * <ul>
 * <li><b>bucket</b> - The name of the bucket to query [string]</li>
 * <li><b>hosts</b> - array of strings from(bucket:"telegraf", hosts:["host1", "host2"])</li>
 * </ul>
 *
 * <h3>Example</h3>
 * <pre>
 * Flux flux = Flux.from("telegraf");
 *
 * Flux flux = Flux
 *      .from("telegraf", new String[]{"192.168.1.200", "192.168.1.100"})
 *      .last();
 * </pre>
 *
 * @author Jakub Bednar (bednar@github) (22/06/2018 10:20)
 * @since 1.0.0
 */
public final class FromFlux extends AbstractParametrizedFlux {

    public FromFlux() {
    }

    @Nonnull
    @Override
    protected String operatorName() {
        return "from";
    }
}
