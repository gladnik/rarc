package ru.lanwen.raml.rarc.rules;

/**
 * Created by stassiak
 */

/**
 * @param <T>
 *            The type of source code item on which this rule can operate
 */
public interface Rule<T> {
    /**
     * Add whatever Java source is required to the given generatable to
     * represent this schema rule.
     *
     * @param generatableType
     *            A code generation construct to which this rule should be
     *            applied
     * @return the newly generated source code item that was added/created as a
     *         result of executing this rule
     */
    void apply(T generatableType, ResourceClassBuilder resourceClassBuilder);
}
