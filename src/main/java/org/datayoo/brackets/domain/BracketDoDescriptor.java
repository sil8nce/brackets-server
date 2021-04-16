package org.datayoo.brackets.domain;

import org.datayoo.domain.core.PropResource;

import javax.persistence.*;

/**
 * 数据对象的描述对象，通过url与数据对象关联。如：数据表对象、文件对象等
 */
@Entity
@Table(name = "BRK_DO_DESCRIPTOR",
    indexes = {@Index(name = "IDX_BRK_DO_DESCRIPTOR", columnList = "RES_ID")
    // @Index(name = "IDX_BRK_DOD_URL", columnList = "URL"),
    })
@Inheritance(strategy = InheritanceType.JOINED)
public class BracketDoDescriptor extends PropResource {

  @Column(name = "URL", nullable = false, length = 1024)
  private String url;

  @ManyToOne
  @JoinColumn(name = "COLSET_ID")
  private BracketColumnSet columnSet;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BracketColumnSet getColumnSet() {
    return columnSet;
  }

  public void setColumnSet(BracketColumnSet columnSet) {
    this.columnSet = columnSet;
  }
}
